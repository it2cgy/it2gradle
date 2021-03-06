package com.yunengzhe.PVMTS.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunengzhe.common.base.service.BaseService;
import com.yunengzhe.common.base.dao.BaseDao;
import com.yunengzhe.PVMTS.dao.ExaminedepartDao;
import com.yunengzhe.PVMTS.domain.po.ExaminedepartPO;


@Service("examinedepartService")
public class ExaminedepartService {

	private static final Logger logger = LoggerFactory.getLogger(ExaminedepartService.class);
	
	@Autowired
	private ExaminedepartDao examinedepartDaoImpl;
	 
}
