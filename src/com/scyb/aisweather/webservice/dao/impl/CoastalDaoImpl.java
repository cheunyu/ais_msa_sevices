package com.scyb.aisweather.webservice.dao.impl;

import com.scyb.aisweather.common.dao.impl.BaseDaoImpl;
import com.scyb.aisweather.webservice.bo.Coastal;
import com.scyb.aisweather.webservice.dao.ICoastalDao;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
public class CoastalDaoImpl extends BaseDaoImpl implements ICoastalDao {

    private Logger log = Logger.getLogger(this.getClass());

    @Override
    public List<Coastal> queryCoastalByDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String hql = "from Coastal as c where to_char(c.createDate, 'yyyy-mm-dd') = '" + sdf.format(date)+"'";
        List<Coastal> coastalList = queryList(hql);
//        for(int i=0;i<coastalList.size();i++) {
//            log.info(coastalList.get(i).toString());
//        }
        return coastalList;
    }
}
