package demo;

import java.util.Scanner;

public class DemoTranslation {
	public final static int ROWS = 20;

	public final static int COLS = 40;

	public static byte[][] buf = new byte[ROWS][COLS];

	public static int maxr = ROWS;

	public static int maxc = COLS;

	public static void setup() {
		for(int r = 0; r < ROWS; r++) {
			for(int c = 0; c < COLS; c++) {
				buf[r][c] = '_';
			}
		}
	}

	public static void print() {
		for(int r = 0; r < ROWS; r++) {
			System.out.printf("%02d: ", r);
			for(int c = 0; c < COLS; c++) {
				System.out.print((char)Byte.toUnsignedInt((byte)((int)(buf[r][c] == '_' ? ' ' : buf[r][c]))));
			}
			System.out.print('\n');
		}
	}

	public static void draw(int x, int h) {
		int c = x;
		for(int i = 0, r = ROWS - h; r < ROWS; r++) {
			if(c - i >= 0 && buf[r][c - i] == '_') {
				buf[r][c - i] = '/';
			}
			if(c + i + 1 < COLS && buf[r][c + i + 1] == '_') {
				buf[r][c + i + 1] = '\\';
			}
			for(int j = c - i; j <= c + i + 1; j++) {
				if(j >= 0 && j < COLS && buf[r][j] == '_') {
					buf[r][j] = ' ';
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int x, h;
		setup();

		for(;;) {
			x = STDIN_SCANNER.nextInt();
			h = STDIN_SCANNER.nextInt();
			while(nextChar(STDIN_SCANNER) != '\n') {
				;
			}
			if(x == 0 && h == 0) {
				break;
			}
			draw(x, h);
		}
		print();
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

	/**
	 * This method is missing from the Scanner interface.
	 */
	public final static int nextChar(Scanner scanner) {
		scanner.useDelimiter("");
		int ret = scanner.next().charAt(0);
		scanner.reset();
		return ret;
	}
}