package colorcoder;

public class Main {

	static ColorPair getColorFromPairNumber(final int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int getPairNumberFromColor(final MajorColor major, final MinorColor minor) {
		return major.getIndex() * ColorPair.numberOfMinorColors + minor.getIndex() + 1;
	}

	static void testNumberToPair(final int pairNumber,
			final MajorColor expectedMajor,
			final MinorColor expectedMinor) {
		ColorPair colorPair = getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert colorPair.getMajor() == expectedMajor;
		assert colorPair.getMinor() == expectedMinor;
	}

	static void testPairToNumber(
			final MajorColor major,
			final MinorColor minor,
			final int expectedPairNumber) {
		int pairNumber = getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert pairNumber == expectedPairNumber;
	}

	public static void main(final String[] args) {
		testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		BaseColor.printAllColors();
	}
}
