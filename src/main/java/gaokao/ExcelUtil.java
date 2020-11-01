package gaokao;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

/**
 * @Author jinlei
 * @Description 引用ali-easyexcel https://alibaba-easyexcel.github.io/support/about.html
 * @Date 2019-11-06
 **/
@Slf4j
public class ExcelUtil {

    /**
     * 导出excel
     * @param outputStream 文件输出流
     * @param title sheet名称
     * @param clazz 模版类
     * @param dataList 导出数据
     * @param <T>
     *
     * @see
     */
    public static <T> void write(OutputStream outputStream, String title, Class<T> clazz, List<T> dataList) {
        try {
            EasyExcel.write(outputStream, clazz).sheet(title).doWrite(dataList);
        } catch (Exception e) {
            log.error("【excel-write】导出excel失败 clazz:{}",clazz,e);
            throw new RuntimeException("导出失败");
        }
    }

    /**
     * 导出excel
     * @param pathName 文件名
     * @param title sheet名称
     * @param clazz 模版类
     * @param dataList 导出数据
     * @param <T>
     *
     * @see
     */
    public static <T> void write(String pathName, String title, Class<T> clazz, List<T> dataList) {
        try {
            EasyExcel.write(pathName, clazz).sheet(title).doWrite(dataList);
        } catch (Exception e) {
            log.error("【excel-write】导出excel失败 clazz:{}",clazz,e);
            throw new RuntimeException("导出失败");
        }
    }

    /**
     * 读取excel
     * @param pathName 文件路径
     * @param clazz 解析模版类
     * @param <T>
     * @return
     */
    public static <T> List<T> read(String pathName, Class<T> clazz) {
        ExcelDataListener listener = new ExcelDataListener<T>();
        try {
            EasyExcel.read(pathName, clazz, listener).sheet().doRead();
            return listener.getResult();
        } catch (Exception e) {
            log.error("【excel-read】读取excel异常，clazz:{}",clazz,e);
        }
        return Collections.emptyList();
    }

    /**
     * 读取excel
     * @param in 输入文件流
     * @param clazz 解析模版类
     * @param <T>
     * @return
     */
    public static <T> List<T> read(InputStream in, Class<T> clazz) {
        ExcelDataListener listener = new ExcelDataListener<T>();
        try {
            EasyExcel.read(in, clazz, listener).sheet().doRead();
            return listener.getResult();
        } catch (Exception e) {
            log.error("【excel-read】读取excel异常，clazz:{}",clazz,e);
        }
        return Collections.emptyList();
    }

}
