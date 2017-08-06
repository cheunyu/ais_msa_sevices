package com.scyb.aisweather.webservice.impl;

import com.scyb.aisweather.vdl.service.ITextService;
import com.scyb.aisweather.vdl.vo.TextVo;
import com.scyb.aisweather.webservice.IInternationalText;
import com.scyb.aisweather.webservice.bo.InternationalTextBo;
import org.apache.commons.beanutils.BeanUtils;

import javax.jws.WebService;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by foo on 2015/4/13.
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IInternationalText")
public class InternationalTextImpl implements IInternationalText{

    private ITextService textServiceImpl;

    public void setTextServiceImpl(ITextService textServiceImpl) {
        this.textServiceImpl = textServiceImpl;
    }

    @Override
    public int iTextBroadcastService(InternationalTextBo iTextBo) {
        TextVo textVo = new TextVo();
        try {
            BeanUtils.copyProperties(textVo, iTextBo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        textVo.setMessageNo(6);
        textVo.setContent(iTextBo.getContent());
        textServiceImpl.transformVdl(textVo);
        return 0;
    }
}
