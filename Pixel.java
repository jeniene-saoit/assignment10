package assign10;

/**
 * This class represents a single pixel in an image. Each pixel is defined by
 * its red, green and blue values, represented as integers ranging from 0 to
 * 255.
 * 
 * @author Jeniene Saoit
 * @version March 15, 2024
 */
public class Pixel {
	private int redAmount;
	private int greenAmount;
	private int blueAmount;

	/**
	 * 
	 * @param redAmount
	 * @param greenAmount
	 * @param blueAmount
	 */
	public Pixel(int redAmount, int greenAmount, int blueAmount) {
		if (redAmount < 0 || redAmount > 255 || greenAmount < 0 || greenAmount > 255 || blueAmount < 0
				|| blueAmount > 255) {
			throw new IllegalArgumentException("Invalid Input: RGB values must be within the range of 0-255.");
		}

		this.redAmount = redAmount;
		this.greenAmount = greenAmount;
		this.blueAmount = blueAmount;
	}

	/**
	 * This method returns the red Amount (integer) of the pixel of an image
	 */
	public int getRedAmount() {
		return redAmount;
	}

	/**
	 * This method returns the green Amount (integer) of the pixel of an image
	 */
	public int getGreenAmount() {
		return greenAmount;
	}

	/**
	 * This method returns the blue Amount (integer) of the pixel of an image
	 */
	public int getBlueAmount() {
		return blueAmount;
	}

	/**
	 * 
	 * @return
	 */
	public int getPackedRGB() {
		return (redAmount << 16) | (greenAmount << 8) | blueAmount;
	}
}