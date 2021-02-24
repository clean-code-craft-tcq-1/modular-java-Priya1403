/**
 * <copyright>
 * 
 * Copyright (c) 2021 ETAS GmbH. All rights reserved.
 * 
 * </copyright>
 */
package colorcoder;

/**
 * 
 */
public class BaseColor {

	public static void printAllColors() {
		System.out.println("--------25-pair color code--------");
		for (MajorColor majorColor : MajorColor.values()) {
			for (MinorColor minorColor : MinorColor.values()) {
				System.out.println(majorColor + " " + minorColor + " " + majorColor.getIndex() + minorColor.getIndex());
			}
		}
	}

}
