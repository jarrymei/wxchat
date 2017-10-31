package com.zhidi.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.TextReqMsg;
import com.github.sd4324530.fastweixin.servlet.WeixinControllerSupport;

@Controller
@RequestMapping("/weixin")
public class WeixinController extends WeixinControllerSupport {

	private static final Logger log = LoggerFactory.getLogger(WeixinController.class);

	private static final String TOKEN = "meijj";
	
	private static final String APPID = "wx70c597c5c795e370";
	
	private static final String ASEKEY = "K8RlP6CIislgRbJzoq6KDE0Q0nsVEYHxMOfY0V5Vxwy";

	@Override
	protected String getToken() {
		return TOKEN;
	}

	// 使用安全模式时设置：APPID
	// 不再强制重写，有加密需要时自行重写该方法
	@Override
	protected String getAppId() {
		return APPID;
	}

	// 使用安全模式时设置：密钥
	// 不再强制重写，有加密需要时自行重写该方法
	@Override
	protected String getAESKey() {
		return ASEKEY;
	}

}
