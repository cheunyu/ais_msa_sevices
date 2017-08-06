package com.scyb.aisweather.vdl.service.impl;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.TextBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IInternationalText;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.CharacterConvertAisCodeUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.TextVo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by foo on 2015/7/1.
 */
public class InternationalTextImpl implements IInternationalText {

    private Logger log = Logger.getLogger(this.getClass());
    private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
    private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
    private CharacterConvertAisCodeUtil ccacUtil = new CharacterConvertAisCodeUtil();
    private ISerialDataService serialDataServiceImpl;
    private IVDMSocket vdmSocketImpl;

    @Override
    public String transformVdl(TextVo tVo) {
        TextBo tBo = new TextBo();
        try {
            BeanUtils.copyProperties(tVo, tBo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        log.info(tVo.toString());
        log.info(tBo.toString());
        String messageHead = new String();
        MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
        // 判断6、8号报文类型
        if (tVo.getMessageNo() == 6) {
            MessageSix messageSix = new MessageSix();
            messageSix.setSource_id(tVo.getSource_id());
            messageSix.setDestination_id(tVo.getDestination_id());
            tBo.setMessageSix(messageSix);
            messageHead = mhbu.generationMessageSixHead(messageSix);
        } else {
            MessageEight messageEight = new MessageEight();
            messageEight.setSource_id(tVo.getSource_id());
            tBo.setMessageEight(messageEight);
            messageHead = mhbu.generationMessageEightHead(messageEight);
        }
        String dac = acbUtil.convertBin(TextBo.getDac(), 10);
        String fi = acbUtil.convertBin(TextBo.getFi(), 6);
        StringBuffer binary = new StringBuffer();
        binary.append(dac).append(fi);
        binary.append(ccacUtil.convertAisCode(tBo.getContent()));
        if (binary.toString().length() % 8 != 0) {
            for (int i = 0; i < binary.toString().length() % 8; i++) {
                binary.append("0");
            }
        }
        List<String> vdmMessageList = new ArrayList<String>();
        log.info(binary.toString());
        vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), tBo.getMessageSix());
        vdmSocketImpl.sendMessage(vdmMessageList);
        StringBuffer messageSB = new StringBuffer();
        for(String str:vdmMessageList) {
            messageSB.append(str);
        }
        return messageSB.toString();
    }
}
