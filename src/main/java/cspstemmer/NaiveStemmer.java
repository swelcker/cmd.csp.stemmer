/*
 * Copyright (C) 2019 S.Welcker
 *
 */
package cspstemmer;

/**
 *
 * @author Chan Chung Kwong
 */
public class NaiveStemmer extends SnowballStemmer{
	@Override
	public boolean stem(){
		return false;
	}
	@Override
	public boolean equals(Object o){
		return o instanceof PorterStemmer;
	}
	@Override
	public int hashCode(){
		return NaiveStemmer.class.getName().hashCode();
	}
}
