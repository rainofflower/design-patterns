package agent.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	
	public NonOwnerInvocationHandler(PersonBean person) {
		//��������person��Ϊ���ƶ���
		this.person = person;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().startsWith("get")){
			return method.invoke(person, args);
		}
		else if(method.getName().startsWith("set")){
			if(method.getName().equals("setHotOrNotRating")){
				return method.invoke(person, args);
			}
			else{
				return new IllegalAccessError();
			}
		}
		return null;
	}


}
