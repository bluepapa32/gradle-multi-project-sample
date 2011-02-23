package com.bluepapa32.bookstore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.bluepapa32.bookstore.dao.BookDAO;
import com.bluepapa32.bookstore.model.Book;

public class BookDAOImpl implements BookDAO {

	private String[] titles = {
			"見せるだけで売れてしまう「事例広告」の方法",
			"キュレーションの時代 「つながり」の情報革命が始まる (ちくま新書)",
			"マネジメント - 基本と原則 [エッセンシャル版]",
			"働く君に贈る25の言葉",
			"ゆるく考えよう 人生を１００倍ラクにする思考法",
			"イシューからはじめよ—知的生産の「シンプルな本質」",
			"なぜ韓国は、パチンコを全廃できたのか（祥伝社新書226）",
			"スティーブ・ジョブズ 驚異のプレゼン—人々を惹きつける18の法則",
			"誰からも「気がきく」と言われる45の習慣",
			"お金の流れが変わった！ (PHP新書)"
	};

	public List<Book> findAll() {
		List<Book> books = new ArrayList<Book>(titles.length);
		for (String title : titles) {
			books.add(new Book(title));
		}
		return books;
	}
}
