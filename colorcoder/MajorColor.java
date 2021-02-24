/**
 * <copyright>
 * 
 * Copyright (c) 2021 ETAS GmbH. All rights reserved.
 * 
 * </copyright>
 */
package colorcoder;

/**
 * Enum for Major color
 */
public enum MajorColor {
	WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

	private int index;

	private MajorColor(final int index) {
		this.index = index;
	}

	int getIndex() {
		return index;
	}

	public static MajorColor fromIndex(final int index) {
		for (MajorColor color : MajorColor.values()) {
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}

}
