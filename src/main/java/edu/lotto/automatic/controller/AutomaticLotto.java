package edu.lotto.automatic.controller;

import edu.lotto.automatic.utils.NumberUtil;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 로또(자동)
 * @since 2021.11.03
 * @author Inmook,Jeong
 */
public class AutomaticLotto {

	private static Logger logger = Logger.getLogger(AutomaticLotto.class.getName());

	public static void main(String[] args) {
		int perchaseAmount = Integer.parseInt(getPerchaseAmount());
		logger.info("사용자가 입력한 구매 금액 : " + perchaseAmount);
	}

	/**
	 * 사용자가 입력한 구매 금액 가져오기
	 * @return
	 */
	public static String getPerchaseAmount() {
		System.out.println("구매금액을 입력해 주세요.");
		Scanner scan = new Scanner(System.in);
		String amount = scan.next();
		if(NumberUtil.checkPerchaseAmountValidation(amount)) {
			amount = getPerchaseAmount();
		}
		return amount;
	}
}
