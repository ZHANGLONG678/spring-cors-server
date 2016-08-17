
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "qqOnlineWebServiceSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QqOnlineWebServiceSoap {


    /**
     * <br /><h3>获得腾讯QQ在线状态</h3><p>输入参数：QQ号码 String，默认QQ号码：8698053。返回数据：String，Y = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量</p><br />
     * 
     * @param qqCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://WebXml.com.cn/qqCheckOnline")
    @WebResult(name = "qqCheckOnlineResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "qqCheckOnline", targetNamespace = "http://WebXml.com.cn/", className = "services.QqCheckOnline")
    @ResponseWrapper(localName = "qqCheckOnlineResponse", targetNamespace = "http://WebXml.com.cn/", className = "services.QqCheckOnlineResponse")
    public String qqCheckOnline(
        @WebParam(name = "qqCode", targetNamespace = "http://WebXml.com.cn/")
        String qqCode);

}
