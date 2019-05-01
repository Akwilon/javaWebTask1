package by.web.task1.service.exceptions;

public class ServiceExceptions extends Throwable {
	
	public ServiceExceptions(String message) {
		super(message);
	}
	
	public ServiceExceptions(String message, Exception e) {
		super(message);
	}
}
