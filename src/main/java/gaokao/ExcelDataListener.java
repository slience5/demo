package gaokao;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

/**
 * excel读取
 * @author jinlei
 */
public class ExcelDataListener<T> extends AnalysisEventListener<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelDataListener.class);

    List<T> list;

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data
     *            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(T data, AnalysisContext context) {
//        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        if(list == null){
            list = Lists.newArrayList();
        }
        list.add(data);
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        LOGGER.info("所有数据解析完成！");
    }

    public List<T> getResult(){
        if(list == null){
            return Collections.emptyList();
        }
        return list;
    }
}