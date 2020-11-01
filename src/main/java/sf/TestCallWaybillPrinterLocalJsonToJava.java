package sf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sf.dto.OrderReq;
import com.sf.dto.OrderReqCargoDetail;
import com.sf.dto.OrderReqContactInfo;
import com.sf.dto.OrderResp;
import com.sf.dto.OrderRespRouteLabelData;
import com.sf.dto.OrderRespRouteLabelInfo;
import com.sf.dto.OrderRespWaybillNoInfo;
import com.sf.util.Base64ImageTools;
import com.sf.util.JsonToJavaBeanUtil;
import com.sf.util.MyJsonUtil;
import com.sf.util.RunTimeUtil;
import dto.CargoInfoDto;
import dto.RlsInfoDto;
import dto.WaybillDto;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * @ClassName: TestCallWaybillPrinterLocalJsonToJava
 * @description: 测试本地读取下单文件和返回文件信息打印面单功能
 * @Date: 2020年6月19日 上午10:47:09
 */
public class TestCallWaybillPrinterLocalJsonToJava {

	public static void main(String[] args) throws Exception {
		TestCallWaybillPrinterLocalJsonToJava.WayBillPrinterTools();
	}

	public static void WayBillPrinterTools() throws Exception {

		RunTimeUtil rt = new RunTimeUtil();

		/********* 2联单 **************/
		/**
		 * 调用打印机 不弹出窗口 适用于批量打印【二联单】
		 */
		String url1 = "http://localhost:4040/sf/waybill/print?type=V2.0_poster_100mm150mm&output=noAlertPrint";
		/**
		 * 调用打印机 弹出窗口 可选择份数 适用于单张打印【二联单】
		 */
		String url2 = "http://localhost:4040/sf/waybill/print?type=V2.0_poster_100mm150mm&output=print";

		/**
		 * 直接输出图片的BASE64编码字符串 可以使用html标签直接转换成图片【二联单】
		 */
		String url3 = "http://localhost:4040/sf/waybill/print?type=V2.0_poster_100mm150mm&output=image";

		/********* 3联单 **************/
		/**
		 * 调用打印机 不弹出窗口 适用于批量打印【三联单】
		 */
		String url4 = "http://localhost:4040/sf/waybill/print?type=V3.0_poster_100mm210mm&output=noAlertPrint";
		/**
		 * 调用打印机 弹出窗口 可选择份数 适用于单张打印【三联单】
		 */
		String url5 = "http://localhost:4040/sf/waybill/print?type=V3.0_poster_100mm210mm&output=print";

		/**
		 * 直接输出图片的BASE64编码字符串 可以使用html标签直接转换成图片【三联单】
		 */
		String url6 = "http://localhost:4040/sf/waybill/print?type=V3.0_poster_100mm210mm&output=image";

		/********* 2联150 丰密运单 **************/
		/**
		 * 调用打印机 不弹出窗口 适用于批量打印【二联单】
		 */
		String url7 = "http://localhost:4040/sf/waybill/print?type=V2.0.FM_poster_100mm150mm&output=noAlertPrint";
		/**
		 * 调用打印机 弹出窗口 可选择份数 适用于单张打印【二联单】
		 */
		String url8 = "http://localhost:4040/sf/waybill/print?type=V2.0.FM_poster_100mm150mm&output=print";

		/**
		 * 直接输出图片的BASE64编码字符串 可以使用html标签直接转换成图片【二联单】
		 */
		String url9 = "http://localhost:4040/sf/waybill/print?type=V2.0.FM_poster_100mm150mm&output=image";

		/********* 3联210 丰密运单 **************/
		/**
		 * 调用打印机 不弹出窗口 适用于批量打印【三联单】
		 */
		String url10 = "http://localhost:4040/sf/waybill/print?type=V3.0.FM_poster_100mm210mm&output=noAlertPrint";
		/**
		 * 调用打印机 弹出窗口 可选择份数 适用于单张打印【三联单】
		 */
		String url11 = "http://localhost:4040/sf/waybill/print?type=V3.0.FM_poster_100mm210mm&output=print";

		/**
		 * 直接输出图片的BASE64编码字符串 可以使用html标签直接转换成图片【三联单】
		 */
		String url12 = "http://localhost:4040/sf/waybill/print?type=V3.0.FM_poster_100mm210mm&output=image";

		// 根据业务需求确定请求地址
		String reqURL = url12;

		// 电子面单顶部是否需要logo
		boolean topLogo = false;// true 需要logo false 不需要logo
		if (reqURL.contains("V2.0") && topLogo) {
			reqURL = reqURL.replace("V2.0", "V2.1");
		}

		if (reqURL.contains("V3.0") && topLogo) {
			reqURL = reqURL.replace("V3.0", "V3.1");
		}

		System.out.println(reqURL);

		/** 注意 需要使用对应业务场景的url **/
		URL myURL = new URL(reqURL);

		// 其中127.0.0.1:4040为打印服务部署的地址（端口如未指定，默认为4040），
		// type为模板类型（支持两联、三联，尺寸为100mm*150mm和100mm*210mm，type为poster_100mm150mm和poster_100mm210mm）
		// A5 poster_100mm150mm A5 poster_100mm210mm
		// output为输出类型,值为print或image，如不传，
		// 默认为print（print 表示直接打印，image表示获取图片的BASE64编码字符串）
		// V2.0/V3.0模板顶部是带logo的 V2.1/V3.1顶部不带logo
		HttpURLConnection httpConn = (HttpURLConnection) myURL.openConnection();
		httpConn.setDoOutput(true);
		httpConn.setDoInput(true);
		httpConn.setUseCaches(false);
		httpConn.setRequestMethod("POST");
		// httpConn.setRequestProperty("Content-Type",
		// "application/json;charset=utf-8");
		httpConn.setRequestProperty("Content-Type", "text/plain;charset=utf-8");
		httpConn.setConnectTimeout(5000);
		httpConn.setReadTimeout(3 * 5000);

		// 读取下订单对象和下订单返回对象
		String reqPathName = "/Users/jinlei/Downloads/order.req.json";
		String resPathName = "/Users/jinlei/Downloads/order.resp.json";
		OrderReq orderReq = JsonToJavaBeanUtil.jsonToJavaBean(reqPathName, OrderReq.class);
		OrderResp orderResp = JsonToJavaBeanUtil.jsonToJavaBean(resPathName, OrderResp.class);

		List<WaybillDto> waybillDtoList = new ArrayList<WaybillDto>();
		WaybillDto dto = new WaybillDto();

		// 这个必填
		dto.setAppId("YbMeJzEo");// 对应客户编码clientCode
		dto.setAppKey("dYlJ86cfBX6VvJwqsUE6U6YbSIagcBhZ");// 对应校验码checkWord
		dto.setMailNo(getWaybillNo(orderResp));
		// dto.setMailNo("755123456788,001000000002");//子母单方式

		// 签回单号 签单返回服务 会打印两份快单 其中第二份作为返寄的单
		if (StringUtils.isNotBlank(getRetrurnTrackWaybillNo(orderResp))) {
			// 如果有签回单才设置值
			dto.setReturnTrackingNo(getRetrurnTrackWaybillNo(orderResp));
		}

		OrderReqContactInfo sj = getOrderReqContactInfo(2, orderReq);
		OrderReqContactInfo jj = getOrderReqContactInfo(1, orderReq);
		// 收件人信息
		if (sj != null) {
			dto.setConsignerProvince(sj.getProvince());
			dto.setConsignerCity(sj.getCity());
			dto.setConsignerCounty(sj.getCountry());
			dto.setConsignerAddress(sj.getAddress()); // 详细地址建议最多30个字 字段过长影响打印效果
			dto.setConsignerCompany(sj.getCompany());
			dto.setConsignerName(sj.getContact());
			dto.setConsignerShipperCode(sj.getPostCode());
			if (StringUtils.isNotBlank(sj.getMobile())) {
				dto.setConsignerMobile(sj.getMobile());
			}
			if (StringUtils.isNotBlank(sj.getTel()))
				dto.setConsignerTel(sj.getTel());
		}

		// 寄件人信息
		if (jj != null) {
			dto.setDeliverProvince(jj.getProvince());
			dto.setDeliverCity(jj.getCity());
			dto.setDeliverCounty(jj.getCountry());
			dto.setDeliverCompany(jj.getCompany());
			dto.setDeliverAddress(jj.getAddress());// 详细地址建议最多30个字 字段过长影响打印效果
			dto.setDeliverName(jj.getContact());
			dto.setDeliverShipperCode(jj.getPostCode());
			if (StringUtils.isNotBlank(jj.getMobile())) {
				dto.setDeliverMobile(jj.getMobile());
			}
			if (StringUtils.isNotBlank(jj.getTel())) {
				dto.setDeliverTel(jj.getTel());
			}
		}

		dto.setDestCode(orderResp.getDestCode());// 目的地代码 参考顺丰地区编号
		dto.setZipCode(orderResp.getOriginCode());// 原寄地代码 参考顺丰地区编号

		// 陆运E标示
		// 业务类型为“电商特惠、顺丰特惠、电商专配、陆运件”则必须打印E标识，用以提示中转场分拣为陆运
		dto.setElectric("E");

		// 快递类型
		// 1 ：标准快递 2.顺丰特惠 3： 电商特惠 5：顺丰次晨 6：顺丰即日 7.电商速配 15：生鲜速配
		dto.setExpressType(orderReq.getExpressTypeId());

		// COD代收货款金额,只需填金额, 单位元- 此项和月结卡号绑定的增值服务相关
		// dto.setCodValue("999.9");
		// 声明货物价值的保价金额,只需填金额,单位元
		// dto.setInsureValue("501");
		dto.setMonthAccount(orderReq.getMonthlyCard());// 月结卡号
		dto.setPayMethod(orderReq.getPayMethod());//

		/** 丰密运单相关-如非使用丰密运单模板 不需要设置以下值 **/
		
		List<RlsInfoDto> rlsInfoDtoList = new ArrayList<RlsInfoDto>();
		RlsInfoDto rlsMain = new RlsInfoDto();
		OrderRespRouteLabelData mainRouteLabelData = queryRouteInfo(orderResp,1);
		// 主运单号
		rlsMain.setWaybillNo(stringValue(mainRouteLabelData.getWaybillNo()));
		rlsMain.setDestRouteLabel(stringValue(mainRouteLabelData.getDestRouteLabel()));
		rlsMain.setPrintIcon(stringValue(mainRouteLabelData.getPrintIcon()));
		rlsMain.setProCode(stringValue(mainRouteLabelData.getProCode()));
		rlsMain.setAbFlag(stringValue(mainRouteLabelData.getAbFlag()));
		rlsMain.setXbFlag(stringValue(mainRouteLabelData.getXbFlag()));
		rlsMain.setCodingMapping(stringValue(mainRouteLabelData.getCodingMapping()));
		rlsMain.setCodingMappingOut(stringValue(mainRouteLabelData.getCodingMappingOut()));
		rlsMain.setDestTeamCode(stringValue(mainRouteLabelData.getDestTeamCode()));
		rlsMain.setSourceTransferCode(stringValue(mainRouteLabelData.getSourceTransferCode()));
		rlsMain.setQrcode(stringValue(mainRouteLabelData.getTwoDimensionCode()));
		rlsInfoDtoList.add(rlsMain);

		if (StringUtils.isNotBlank(dto.getReturnTrackingNo())) {
			RlsInfoDto rlsBack = new RlsInfoDto();
			OrderRespRouteLabelData returnRouteLabelData = queryRouteInfo(orderResp,3);
			// 签回运单号
			rlsBack.setWaybillNo(stringValue(returnRouteLabelData.getWaybillNo()));
			rlsBack.setDestRouteLabel(stringValue(returnRouteLabelData.getDestRouteLabel()));
			rlsBack.setPrintIcon(stringValue(returnRouteLabelData.getPrintIcon()));
			rlsBack.setProCode(stringValue(returnRouteLabelData.getProCode()));
			rlsBack.setAbFlag(stringValue(returnRouteLabelData.getAbFlag()));
			rlsBack.setXbFlag(stringValue(returnRouteLabelData.getXbFlag()));
			rlsBack.setCodingMapping(stringValue(returnRouteLabelData.getCodingMapping()));
			rlsBack.setCodingMappingOut(stringValue(returnRouteLabelData.getCodingMappingOut()));
			rlsBack.setDestTeamCode(stringValue(returnRouteLabelData.getDestTeamCode()));
			rlsBack.setSourceTransferCode(stringValue(returnRouteLabelData.getSourceTransferCode()));
			rlsBack.setQrcode(stringValue(returnRouteLabelData.getTwoDimensionCode()));
			rlsInfoDtoList.add(rlsBack);
		}

		// 设置丰密运单必要参数
		dto.setRlsInfoDtoList(rlsInfoDtoList);
		// 客户个性化Logo 必须是个可以访问的图片本地路径地址或者互联网图片地址
		// dto.setCustLogo("D:\\ibm.jpg");

		// 备注相关
		dto.setMainRemark("这是主运单的备注");
		dto.setChildRemark("子单号备注");
		dto.setReturnTrackingRemark("迁回单备注");

		// 加密项
		dto.setEncryptCustName(true);// 加密寄件人及收件人名称
		dto.setEncryptMobile(true);// 加密寄件人及收件人联系手机

		
		//添加货物
		List<CargoInfoDto> cargoInfoList = new ArrayList<CargoInfoDto>();
		List<OrderReqCargoDetail> cargoList = orderReq.getCargoDetails();
		if (cargoList != null && cargoList.size() > 0) {
			for (OrderReqCargoDetail cargo : cargoList) {
				CargoInfoDto cargo1 = new CargoInfoDto();
				cargo1.setCargo(cargo.getName());
				cargo1.setCargoCount(cargo.getCount() == null ? 1 : cargo.getCount().intValue());
				cargo1.setCargoUnit(StringUtils.isNotBlank(cargo.getUnit()) ? cargo.getUnit() : "");
				cargoInfoList.add(cargo1);
			}
			dto.setCargoInfoDtoList(cargoInfoList);
		}

		dto.setCargoInfoDtoList(cargoInfoList);

		waybillDtoList.add(dto);

		System.out.println("请求参数1==： "+ MyJsonUtil.object2json(waybillDtoList));

		// System.out.println(waybillDtoList.get(0).getRlsInfoDtoList().size());

		ObjectMapper objectMapper = new ObjectMapper();
		StringWriter stringWriter = new StringWriter();
		// System.out.println("请求参数2：
		// "+MyJsonUtil.object2json(stringWriter.toString().getBytes()));
		objectMapper.writeValue(stringWriter, waybillDtoList);

		httpConn.getOutputStream().write(stringWriter.toString().getBytes());

		httpConn.getOutputStream().flush();
		httpConn.getOutputStream().close();
		InputStream in = httpConn.getInputStream();

		BufferedReader in2 = new BufferedReader(new InputStreamReader(in));

		System.out.println(rt.returnRunTimes("调用接口耗时::"));
		;
		String y = "";

		String strImg = "";
		while ((y = in2.readLine()) != null) {

			strImg = y.substring(y.indexOf("[") + 1, y.length() - "]".length() - 1);
			if (strImg.startsWith("\"")) {
				strImg = strImg.substring(1, strImg.length());
			}
			if (strImg.endsWith("\"")) {
				strImg = strImg.substring(0, strImg.length() - 1);
			}

		}

		// 将换行全部替换成空
		strImg = strImg.replace("\\n", "");
		// System.out.println(strImg);

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String dateStr = format.format(new Date());

		if (strImg.contains("\",\"")) {
			// 如子母单及签回单需要打印两份或者以上
			String[] arr = strImg.split("\",\"");

			/** 输出图片到本地 支持.jpg、.png格式 **/
			for (int i = 0; i < arr.length; i++) {
				Base64ImageTools.generateImage(arr[i].toString(), "/Users/jinlei/Downloads/qiaoWay" + dateStr + "-" + i + ".jpg");

			}
		} else {
			Base64ImageTools.generateImage(strImg, "/Users/jinlei/Downloads/qiaoWaybill" + dateStr + ".jpg");

		}

		// System.exit(0);
	}

	/**
	 * 一般只获取主运单和签回单的路由明细对象信息
	 * 
	 * @param resp
	 * @param routeType
	 *            1.主运单 2.子单号(子单号只获取其中一个) 3.签回单
	 * @return
	 */
	private static OrderRespRouteLabelData queryRouteInfo(OrderResp orderResp, Integer routeType) {
		List<OrderRespWaybillNoInfo> wayBillList = orderResp.getWaybillNoInfoList();
		if (wayBillList == null || wayBillList.size() == 0) {
			return null;
		}
		OrderRespWaybillNoInfo aimWaybill = null;
		for (OrderRespWaybillNoInfo waybillNoInfo : wayBillList) {
			if (String.valueOf(routeType).equals(String.valueOf(waybillNoInfo.getWaybillType()))) {
				aimWaybill = waybillNoInfo;
				break;
			}
		}

		if (aimWaybill == null) {
			return null;
		}

		List<OrderRespRouteLabelInfo> routeLabelInfos = orderResp.getRouteLabelInfo();
		if (routeLabelInfos == null || routeLabelInfos.size() == 0) {
			return null;
		}
		
		for(OrderRespRouteLabelInfo routeLabelInfo:routeLabelInfos) {
			if("1000".equals(routeLabelInfo.getCode()) 
					&& routeLabelInfo.getRouteLabelData()!=null 
					&& aimWaybill.getWaybillNo().equals(routeLabelInfo.getRouteLabelData().getWaybillNo())) {
				return routeLabelInfo.getRouteLabelData();
			}
		}
		return null;
	}

	/**
	 * 获取收寄双方对象信息
	 * 
	 * @param contactType
	 *            1，寄件方信息 2，到件方信息
	 */
	private static OrderReqContactInfo getOrderReqContactInfo(Integer contactType, OrderReq orderReq) {
		if (contactType != 1 && contactType != 2) {
			return null;
		}

		List<OrderReqContactInfo> list = orderReq.getContactInfoList();
		if (list == null || list.size() == 0) {
			return null;
		}
		for (OrderReqContactInfo contactInfo : list) {
			if (contactType == contactInfo.getContactType()) {
				return contactInfo;
			}
		}
		return null;
	}

	/**
	 * 获取母单号排在前面的运单号【列表，逗号隔开】
	 * 
	 * @param orderResp
	 * @return
	 */
	private static String getWaybillNo(OrderResp orderResp) {
		if (orderResp==null) {
			return StringUtils.EMPTY;
		}

		List<OrderRespWaybillNoInfo> wayBillList = orderResp.getWaybillNoInfoList();
		if (wayBillList == null || wayBillList.size() == 0) {
			return StringUtils.EMPTY;
		}

		// 只有一个运单号直接返回
		if (wayBillList.size() == 1) {
			return wayBillList.get(0).getWaybillNo();
		}

		// 把母单号放最前面
		StringBuffer sBuffer = new StringBuffer();
		for (OrderRespWaybillNoInfo waybillNoInfo : wayBillList) {
			if (waybillNoInfo.getWaybillType() == 1) {
				sBuffer.append(waybillNoInfo.getWaybillNo());
				break;
			}
		}

		for (OrderRespWaybillNoInfo waybillNoInfo : wayBillList) {
			if (waybillNoInfo.getWaybillType() != 1) {
				sBuffer.append(",");
				sBuffer.append(waybillNoInfo.getWaybillNo());
			}
		}
		return sBuffer.toString();
	}

	/**
	 * 获取签回单号
	 * 
	 * @param orderResp
	 * @return
	 */
	private static String getRetrurnTrackWaybillNo(OrderResp orderResp) {
		if (orderResp==null) {
			return StringUtils.EMPTY;
		}

		List<OrderRespWaybillNoInfo> wayBillList = orderResp.getWaybillNoInfoList();
		if (wayBillList == null || wayBillList.size() == 0) {
			return StringUtils.EMPTY;
		}

		// 寻找签回单
		for (OrderRespWaybillNoInfo waybillNoInfo : wayBillList) {
			if (waybillNoInfo.getWaybillType() == 3) {
				return waybillNoInfo.getWaybillNo();
			}
		}
		return StringUtils.EMPTY;
	}
	
	private static String stringValue(String temp) {
		if(StringUtils.isBlank(temp)) {
			return StringUtils.EMPTY;
		}
		return temp;
	}

	private static int getCargoCount(List<CargoInfoDto> cargoInfoDtoList) {
		int count = 0;
		if (null != cargoInfoDtoList && !cargoInfoDtoList.isEmpty()) {

			for (CargoInfoDto dto : cargoInfoDtoList) {
				count += dto.getCargoCount();
			}
			return count;
		}
		return count;
	}
}
