package com.jeesite.common.utils;

import com.drew.metadata.*;
import com.drew.metadata.exif.*;
import com.drew.imaging.jpeg.*;
import com.drew.lang.*;
import java.io.*;
import java.util.Collection;

public class ImageGeo {
	public double lat = 0.0;
	public double lon = 0.0;
	public double alt = 0.0;
	public boolean error = false;

	public ImageGeo(String filename) {
	
			
			
		

			

	}

	public static void main(String[] args) {
		ImageGeo imageGeo = new ImageGeo(ImageGeo.class.getResource("IMAG0068.jpg").getFile());
		System.out.println(imageGeo.lon + "," + imageGeo.lat);
	}

}
