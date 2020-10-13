package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListSpyTest {
	
	@Test
	public void testList() {
		List<String> Flowers = Mockito.mock(List.class);
		Mockito.when(Flowers.get(0)).thenReturn("rose");
		assertEquals("rose", Flowers.get(0));
		
	}

	public void testSpyList() {
		List<String> Flowers=new ArrayList<String>();
		List<String> SpyFlowers=Mockito.spy(Flowers);
		Mockito.when(SpyFlowers.get(0)).thenReturn("rose");
		assertEquals("rose", SpyFlowers.get(0));
	}
	
}