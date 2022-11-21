package com.example.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Device;
import com.example.model.Devices;


@RestController
@RequestMapping("/apple")
public class Apple {
@RequestMapping("/devices")
public Devices getDevices()
	{
		List<Device> devices=new ArrayList<>();
		devices.add(new Device("Iphone13","Smart Phone"));
		devices.add(new Device("Ipod","Listen Music"));
		Devices list=new Devices("Apple",devices);
		return list;
	}

        @RequestMapping("/something")
        public void getSomething()
        {
        	
        }
}
