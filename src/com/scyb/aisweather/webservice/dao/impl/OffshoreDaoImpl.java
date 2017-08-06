package com.scyb.aisweather.webservice.dao.impl;

import com.scyb.aisweather.common.dao.impl.BaseDaoImpl;
import com.scyb.aisweather.webservice.bo.Ocean;
import com.scyb.aisweather.webservice.bo.Offshore;
import com.scyb.aisweather.webservice.dao.IOceanDao;
import com.scyb.aisweather.webservice.dao.IOffshoreDao;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
public class OffshoreDaoImpl extends BaseDaoImpl implements IOffshoreDao {

    private Logger log = Logger.getLogger(this.getClass());

    public List<Offshore> queryOffshoreByDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String hql = "from Offshore as o where to_char(o.createDate, 'yyyy-mm-dd') = '" + sdf.format(date)+"'";
        queryList(hql);
        List<Offshore> OffshoreList = queryList(hql);
//        for(int i=0;i<coastalList.size();i++) {
//            log.info(coastalList.get(i).toString());
//        }
        return OffshoreList;
    }
}
