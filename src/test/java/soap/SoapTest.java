package soap;

import com.alibaba.fastjson.JSON;
import com.soap.ws.client.IReceivePolicyPkg;
import com.soap.ws.client.PolicyFormRequest;
import com.soap.ws.client.PolicyResponse;
import com.soap.ws.client.ReceivePolicyPkgImpService;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class SoapTest {

    public static void main(String[] args) {
        ReceivePolicyPkgImpService service = new ReceivePolicyPkgImpService();

        IReceivePolicyPkg policyPkg = service.getReceivePolicyPkgImpPort();

        PolicyFormRequest request = new PolicyFormRequest();
        request.setKey("86n615d611665d168662g662891121og");
        request.setUsername("visaai");
//        request.setCurrenttime("2020-09-03");
        request.setCurrpage(1);
        request.setPagesize(10);
//        request.setLastupdatetime("2019-01-01");
        request.setRequesttype("0");

        PolicyResponse response = policyPkg.getPolicyDateAll(request);
        System.out.println(JSON.toJSONString(response));
    }
}
