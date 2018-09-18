package com.tronipm.correios.util;

import java.util.Comparator;

import com.tronipm.correios.html.HTMLObject;

/**
 * 
 * @author Paulo Mateus
 * @email paulomatew@gmail.com
 * @project Correios
 *
 */
public class ComparatorAsc implements Comparator<HTMLObject> {
	@Override
	public int compare(HTMLObject o1, HTMLObject o2) {
		return (o1.getLine_start() < o2.getLine_start()) ? -1 : ((o1.getLine_start() > o2.getLine_start()) ? 1 : 0);
	}
}
