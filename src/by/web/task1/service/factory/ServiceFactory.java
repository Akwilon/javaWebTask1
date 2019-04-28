package by.web.task1.service.factory;

import by.web.task1.service.RoomService;
import by.web.task1.service.ToyService;
import by.web.task1.service.impl.RoomSeviceImpl;
import by.web.task1.service.impl.ToyServiceImpl;

public class ServiceFactory {
	private static ServiceFactory instance;
	private final RoomService RoomService = new RoomSeviceImpl();
	private final ToyService ToyService = new ToyServiceImpl();
	
	private ServiceFactory(){
		
	}
	
	public static ServiceFactory getInstance(){
		if (instance == null) {
			instance = new ServiceFactory();
		} 
		return instance;
	}
	public RoomService getRoomService(){
		return RoomService;
	}
	public ToyService getToyService(){
		return ToyService;
	}
}
