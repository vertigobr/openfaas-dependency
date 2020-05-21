import com.github.vertigobr.openfaas.model.IHandler;
import com.github.vertigobr.openfaas.model.IRequest;
import com.github.vertigobr.openfaas.model.IResponse;
import com.github.vertigobr.openfaas.model.Response;

public class TestHandler implements IHandler {
    public IResponse Handle(IRequest req) {
        Response res = new Response();
	    res.setBody("Hello, World!");
	    return res;
    }
}