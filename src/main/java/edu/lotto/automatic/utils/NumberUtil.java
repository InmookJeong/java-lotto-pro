package edu.lotto.automatic.utils;

import edu.lotto.automatic.constants.PatternConstants;

import java.util.regex.Pattern;

/**
 * 숫자 검증 Util
 * @since 2021.11.03
 * @author Inmook,Jeong
 */
public class NumberUtil {

	private static final int THOUSAND = 1000;

	/**
	 * 숫자 형식의 문자열인지 확인
	 * @param value
	 * @return
	 */
	public static boolean isNumber(String value) {
		return Pattern.matches(PatternConstants.NUMBER_PATTERN, value);
	}

	/**
	 * 1000 이상의 숫자인지 확인
	 * @param value
	 * @return
	 */
	public static boolean isMoreThanThousand(int value) {
		return (value >= THOUSAND);
	}

	/**
	 * 사용자가 입력한 구매 금액이 숫자이고, 1000 이상의 숫자인지 확인
	 * @param amount
	 * @return
	 */
	public static boolean checkPerchaseAmountValidation(String amount) {
		boolean validPerchaseAmount = true;
		if(NumberUtil.isNumber(amount)) {
			validPerchaseAmount = false;
			System.out.println("숫자만 입력 가능합니다.");
		}
		if(!NumberUtil.isMoreThanThousand(Integer.parseInt(amount))) {
			validPerchaseAmount = false;
			System.out.println("로또 1장의 가격은 1000원입니다.");
		}
		return validPerchaseAmount;
	}
}