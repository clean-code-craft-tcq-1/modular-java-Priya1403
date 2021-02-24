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
public class ColorPair {

	final static String MajorColorNames[] = {
			"White", "Red", "Black", "Yellow", "Violet"
	};
	final static int numberOfMajorColors = MajorColorNames.length;
	final static String MinorColorNames[] = {
			"Blue", "Orange", "Green", "Brown", "Slate"
	};
	final static int numberOfMinorColors = MinorColorNames.length;

	private final MajorColor majorColor;
	private final MinorColor minorColor;

	public ColorPair(final MajorColor major, final MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	@Override
	public String toString() {
		String colorPairStr = MajorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += MinorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}

}
