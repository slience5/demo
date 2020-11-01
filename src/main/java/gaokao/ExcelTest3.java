package gaokao;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.UUIDUtil;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author jinlei
 * @Description
 * @Date 2019-11-06
 **/
public class ExcelTest3 {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DemoData{
        @ExcelProperty("学校")
        private String schoolName;

        @ExcelProperty("专业")
        private String profession;

        @ExcelProperty("城市")
        private String city;

        @ExcelProperty("招生人数")
        private String num;

        @ExcelProperty("19")
        private Integer nineteen;

        @ExcelProperty("18")
        private Integer eighteen;
    }

    private static final String NO_USED_PROFESSION = "哲学类包括哲学、逻辑学、宗教学、伦理学专业； 经济学类包括经济学、国际经济与贸易、财政学、金融学、 国民经济管理、贸易经济、保险、金融工程、税务、信用管理、网络经济学、体育经济、投资学、环境资源与发展经济学、海洋经济学等专业； 法学类包括法学、知识产权、监狱学； 社会学类包括社会学、社会工、家政学、人类学专业；也有把社会学类各专业纳入法学大类的。中国语言文学类包括汉语言文学、汉语言、对外汉语、 中国少数民族语言文学、古典文献 、中国语言文化、应用语言学； 外国语言文学类包括英语 、 俄语 、 德语、 法语、 西班牙语、 阿拉伯语、 日语 、 波斯语 、 朝鲜语、 菲律宾语、 梵语巴利语、 印度尼西亚语、 印地语 、 柬埔寨语 、 老挝语、 缅甸语 、 马来语 、蒙古语 、僧加罗语 、 泰语、 乌尔都语 、希伯莱语、 越南语 、豪萨语 、 斯瓦希里语 、 阿尔巴尼亚语 、保加利亚语 、波兰语 、捷克语 、 罗马尼亚语 、 葡萄牙语 、瑞典语 、塞尔维亚——克罗地亚语 、土耳其语 、希腊语、 匈牙利语 、 意大利语 、捷克语——斯洛伐克语 、 泰米尔语 、 普什图语、 世界语、 孟加拉语、 尼泊尔语 、塞尔维亚语——克罗地亚语 、荷兰语 、 芬兰语 、 乌克兰语 、 韩国语，是包涵专业最多的学科";

    private static final String RECOMMEND_CITY = "北京市,上海市,深圳市,广州市, 杭州市, 武汉市, 成都市, 南京市, 沈阳市, 长沙市, 石家庄市, 郑州市, 济南市, 哈尔滨市, 长春市, 西安市, 福州市, 合肥市, 南昌市, 昆明市, 呼和浩特市, 南宁市, 太原市, 乌鲁木齐市, 贵阳市, 兰州市, 西宁市, 海口市, 银川市, 拉萨市";


    public static void main(String[] args) {
        System.out.println(Arrays.asList(GraphicsEnvironment
                .getLocalGraphicsEnvironment().getAvailableFontFamilyNames()));
//        List<DemoData> resultList = ExcelUtil.read("/Users/jinlei/Downloads/志愿 - 副本.xlsx",DemoData.class);
//        System.out.println(JSON.toJSONString(resultList));
//
//        List<DemoData> filterdResult = resultList.stream().filter(result -> {
//            // 过滤独立学院
//            if(result.getSchoolName().contains("大学") && result.getSchoolName().contains("学院")){
//                return false;
//            }
//            // 过滤社科类专业
//            // 过滤中外合办专业
//            if(NO_USED_PROFESSION.contains(result.getProfession())
//            || result.getProfession().contains("中外合办")){
//                return false;
//            }
//            // 过滤非省会城市
//            if(!RECOMMEND_CITY.contains(result.getCity())){
//                return false;
//            }
//            // 过滤 10万之前的排名
//            if((result.getEighteen() != null &&  result.getEighteen() < 100000)
//                    && (result.getEighteen() != null &&  result.getNineteen() < 100000)){
//                return false;
//            }
//
//            System.out.println(JSON.toJSONString(result));
//
//            return true;
//        }).collect(Collectors.toList());

//        ExcelUtil.write("/Users/jinlei/Downloads/志愿-筛选.xlsx","志愿-筛选",DemoData.class,filterdResult);
    }
}
