package com.courses.oopEntryTest;

import java.util.*;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
	/**
	 * Method contains inside of its body three another methods.
	 * Each of this method defined below.
	 *
	 * @param  text
	 * @return sorted by natural order array of unique words
	 * */
	public static String[] getUniqueSortedWords(String text) {

		String[] words = getWords(text);
		String[] uniqueWords = getUniqueWords(words);
		return sortWords(uniqueWords);
	}
	/**
	 * @param text
	 * @return array with words, get from receive text
	 *          if received argument is null
	 *          or text length is zero
	 *          return array with zero length
	 * */
	public static String[] getWords(String text) {
		if (text == null || text.isEmpty()){
			return new String[0];
		}
		return text.split("; ");

	}
	/**
	 * @param words array with words
	 * @return  array with unique words
	 * */
	public static String[] getUniqueWords(String[] words) {
		Set<String> set = new LinkedHashSet<>();
		set.addAll(Arrays.asList(words));
		return set.toArray(new String[set.size()]);
	}

	/**
	 * @param  uniqueWords array with unique words
	 * @return sorted by natural order array of unique words
	 * */
	public static String[] sortWords(String[] uniqueWords) {
		Arrays.sort(uniqueWords);
		return uniqueWords;
	}
}