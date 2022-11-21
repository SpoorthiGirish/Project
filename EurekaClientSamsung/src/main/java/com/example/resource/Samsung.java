package com.example.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Device;
import com.example.model.Devices;

@RestController
@RequestMapping("/samsung")
public class Samsung {
	@RequestMapping("/devices")
	public Devices getDevices()
		{
			List<Device> devices=new ArrayList<>();
			devices.add(new Device("Samsung Galaxy","Smart Phone"));
			devices.add(new Device("Samsung Note","Tablet"));
			Devices list=new Devices("Samsung",devices);
			return list;
		}

	        @RequestMapping("/something")
	        public void getSomething()
	        {
	        	
	        }
	}
