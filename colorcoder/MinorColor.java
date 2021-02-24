/**
 * <copyright>
 * 
 * Copyright (c) 2021 ETAS GmbH. All rights reserved.
 * 
 * </copyright>
 */
package colorcoder;

/**
 * Enum for Minor color
 */
public enum MinorColor {

	BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);
	final static String MinorColorNames[] = {
			"Blue", "Orange", "Green", "Brown", "Slate"
	};
	private int index;

	private MinorColor(final int index) {
		this.index = index;
	}

	int getIndex() {
		return index;
	}

	public static MinorColor fromIndex(final int index) {
		for (MinorColor color : MinorColor.values()) {
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}
}
