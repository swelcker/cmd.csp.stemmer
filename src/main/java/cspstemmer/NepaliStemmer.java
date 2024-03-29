
// http://snowballstem.org/
package cspstemmer;

/**
 * This class was automatically generated by a Snowball to Java compiler It
 * implements the stemming algorithm defined by a snowball script.
 */
public class NepaliStemmer extends SnowballStemmer{
	private static final long serialVersionUID=1L;
	private final static Among a_0[]={
		new Among("\u00E0\u00A4\u0095\u00E0\u00A5\u0080",-1,2),
		new Among("\u00E0\u00A4\u00B2\u00E0\u00A4\u00BE\u00E0\u00A4\u0087",-1,1),
		new Among("\u00E0\u00A4\u00B2\u00E0\u00A5\u0087",-1,1),
		new Among("\u00E0\u00A4\u00B2\u00E0\u00A4\u00BE\u00E0\u00A4\u0088",-1,1),
		new Among("\u00E0\u00A4\u0095\u00E0\u00A5\u0088",-1,2),
		new Among("\u00E0\u00A4\u00B8\u00E0\u00A4\u0081\u00E0\u00A4\u0097\u00E0\u00A5\u0088",-1,1),
		new Among("\u00E0\u00A4\u00AE\u00E0\u00A5\u0088",-1,1),
		new Among("\u00E0\u00A4\u0095\u00E0\u00A5\u008B",-1,2),
		new Among("\u00E0\u00A4\u00B8\u00E0\u00A4\u0081\u00E0\u00A4\u0097",-1,1),
		new Among("\u00E0\u00A4\u00B8\u00E0\u00A4\u0082\u00E0\u00A4\u0097",-1,1),
		new Among("\u00E0\u00A4\u00AE\u00E0\u00A4\u00BE\u00E0\u00A4\u00B0\u00E0\u00A5\u008D\u00E0\u00A4\u00AB\u00E0\u00A4\u00A4",-1,1),
		new Among("\u00E0\u00A4\u00B0\u00E0\u00A4\u00A4",-1,1),
		new Among("\u00E0\u00A4\u0095\u00E0\u00A4\u00BE",-1,2),
		new Among("\u00E0\u00A4\u00AE\u00E0\u00A4\u00BE",-1,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A5\u008D\u00E0\u00A4\u00B5\u00E0\u00A4\u00BE\u00E0\u00A4\u00B0\u00E0\u00A4\u00BE",-1,1),
		new Among("\u00E0\u00A4\u0095\u00E0\u00A4\u00BF",-1,2),
		new Among("\u00E0\u00A4\u00AA\u00E0\u00A4\u009B\u00E0\u00A4\u00BF",-1,1)
	};
	private final static Among a_1[]={
		new Among("\u00E0\u00A4\u0081",-1,-1),
		new Among("\u00E0\u00A4\u0082",-1,-1),
		new Among("\u00E0\u00A5\u0088",-1,-1)
	};
	private final static Among a_2[]={
		new Among("\u00E0\u00A4\u0081",-1,1),
		new Among("\u00E0\u00A4\u0082",-1,1),
		new Among("\u00E0\u00A5\u0088",-1,2)
	};
	private final static Among a_3[]={
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A5\u0080",-1,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u0080",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u0080",1,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u0080",1,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A5\u0087\u00E0\u00A4\u0096\u00E0\u00A5\u0080",-1,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A5\u0080",-1,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A5\u0080",-1,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A5\u0081",-1,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A5\u0081",7,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A5\u0081",8,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u009B\u00E0\u00A5\u0081",7,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0081",-1,1),
		new Among("\u00E0\u00A4\u00B9\u00E0\u00A4\u00B0\u00E0\u00A5\u0081",-1,1),
		new Among("\u00E0\u00A4\u00B9\u00E0\u00A4\u00B0\u00E0\u00A5\u0082",-1,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A5\u0087",-1,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A5\u0087",-1,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087",-1,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A5\u0088",-1,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A5\u0088",17,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u0088",-1,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A5\u0088",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u00A6\u00E0\u00A5\u0088",20,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u00A6\u00E0\u00A5\u0088",20,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A5\u008B",-1,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A5\u008B",23,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u008B",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u008B",25,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A5\u008B",25,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A5\u008B",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u00A6\u00E0\u00A5\u008B",28,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u00A6\u00E0\u00A5\u008B",28,1),
		new Among("\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",31,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A5\u008D\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",31,1),
		new Among("\u00E0\u00A4\u00AD\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",31,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",31,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",35,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A4\u00BF\u00E0\u00A4\u00AF\u00E0\u00A5\u008B",35,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A5\u008C",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u009B\u00E0\u00A5\u008C",38,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A5\u008C",38,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A5\u008C",40,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u009B\u00E0\u00A5\u008C",38,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u009B\u00E0\u00A5\u008C",38,1),
		new Among("\u00E0\u00A4\u00AF\u00E0\u00A5\u008C",-1,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A5\u008D\u00E0\u00A4\u00AF\u00E0\u00A5\u008C",44,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A5\u008D\u00E0\u00A4\u00AF\u00E0\u00A5\u008C",44,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF\u00E0\u00A4\u00AF\u00E0\u00A5\u008C",44,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u009B\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",48,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",48,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",50,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u009B\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",48,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u009B\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",48,1),
		new Among("\u00E0\u00A4\u00B2\u00E0\u00A4\u00BE\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A4\u00BF\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF\u00E0\u00A4\u00A8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u00AA\u00E0\u00A4\u00B0\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF\u00E0\u00A4\u0087\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",58,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A5\u0087\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u00B9\u00E0\u00A5\u008B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u009B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u009B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",62,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",62,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u009B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",64,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u009B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",62,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u009B\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",62,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",-1,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF\u00E0\u00A4\u00B8\u00E0\u00A5\u008D",68,1),
		new Among("\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF\u00E0\u00A4\u008F",-1,1),
		new Among("\u00E0\u00A4\u009B",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u009B",73,1),
		new Among("\u00E0\u00A4\u00B9\u00E0\u00A5\u0081\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u009B",74,1),
		new Among("\u00E0\u00A4\u00B9\u00E0\u00A5\u0081\u00E0\u00A4\u00A8\u00E0\u00A5\u008D\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u00A8\u00E0\u00A5\u008D\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u00A8\u00E0\u00A5\u008D\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u009B",71,1),
		new Among("\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A4\u00BE",-1,1),
		new Among("\u00E0\u00A4\u00A8\u00E0\u00A5\u0087\u00E0\u00A4\u0095\u00E0\u00A4\u00BE",81,1),
		new Among("\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A4\u00BE",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A4\u00BE",83,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u008F\u00E0\u00A4\u0095\u00E0\u00A4\u00BE",83,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A4\u00BE",-1,1),
		new Among("\u00E0\u00A4\u0087\u00E0\u00A4\u00A6\u00E0\u00A4\u00BE",86,1),
		new Among("\u00E0\u00A4\u00BF\u00E0\u00A4\u00A6\u00E0\u00A4\u00BE",86,1),
		new Among("\u00E0\u00A4\u00A6\u00E0\u00A5\u0087\u00E0\u00A4\u0096\u00E0\u00A4\u00BF",-1,1),
		new Among("\u00E0\u00A4\u00AE\u00E0\u00A4\u00BE\u00E0\u00A4\u00A5\u00E0\u00A4\u00BF",-1,1)
	};
	private boolean r_remove_category_1(){
		int among_var;
		// (, line 53
		// [, line 54
		ket=cursor;
		// substring, line 54
		among_var=find_among_b(a_0);
		if(among_var==0){
			return false;
		}
		// ], line 54
		bra=cursor;
		switch(among_var){
			case 0:
				return false;
			case 1:
				// (, line 58
				// delete, line 58
				slice_del();
				break;
			case 2:
				// (, line 59
				// or, line 59
				lab0:
				do{
					int v_1=limit-cursor;
					lab1:
					do{
						// (, line 59
						// or, line 59
						lab2:
						do{
							int v_2=limit-cursor;
							lab3:
							do{
								// literal, line 59
								if(!(eq_s_b("\u00E0\u00A4\u008F"))){
									break lab3;
								}
								break lab2;
							}while(false);
							cursor=limit-v_2;
							// literal, line 59
							if(!(eq_s_b("\u00E0\u00A5\u0087"))){
								break lab1;
							}
						}while(false);
						// (, line 59
						break lab0;
					}while(false);
					cursor=limit-v_1;
					// delete, line 59
					slice_del();
				}while(false);
				break;
		}
		return true;
	}
	private boolean r_check_category_2(){
		// (, line 63
		// [, line 64
		ket=cursor;
		// substring, line 64
		if(find_among_b(a_1)==0){
			return false;
		}
		// ], line 64
		bra=cursor;
		return true;
	}
	private boolean r_remove_category_2(){
		int among_var;
		// (, line 69
		// [, line 70
		ket=cursor;
		// substring, line 70
		among_var=find_among_b(a_2);
		if(among_var==0){
			return false;
		}
		// ], line 70
		bra=cursor;
		switch(among_var){
			case 0:
				return false;
			case 1:
				// (, line 71
				// or, line 71
				lab0:
				do{
					int v_1=limit-cursor;
					lab1:
					do{
						// literal, line 71
						if(!(eq_s_b("\u00E0\u00A4\u00AF\u00E0\u00A5\u008C"))){
							break lab1;
						}
						break lab0;
					}while(false);
					cursor=limit-v_1;
					lab2:
					do{
						// literal, line 71
						if(!(eq_s_b("\u00E0\u00A4\u009B\u00E0\u00A5\u008C"))){
							break lab2;
						}
						break lab0;
					}while(false);
					cursor=limit-v_1;
					lab3:
					do{
						// literal, line 71
						if(!(eq_s_b("\u00E0\u00A4\u00A8\u00E0\u00A5\u008C"))){
							break lab3;
						}
						break lab0;
					}while(false);
					cursor=limit-v_1;
					// literal, line 71
					if(!(eq_s_b("\u00E0\u00A4\u00A5\u00E0\u00A5\u0087"))){
						return false;
					}
				}while(false);
				// delete, line 71
				slice_del();
				break;
			case 2:
				// (, line 72
				// literal, line 72
				if(!(eq_s_b("\u00E0\u00A4\u00A4\u00E0\u00A5\u008D\u00E0\u00A4\u00B0"))){
					return false;
				}
				// delete, line 72
				slice_del();
				break;
		}
		return true;
	}
	private boolean r_remove_category_3(){
		int among_var;
		// (, line 76
		// [, line 77
		ket=cursor;
		// substring, line 77
		among_var=find_among_b(a_3);
		if(among_var==0){
			return false;
		}
		// ], line 77
		bra=cursor;
		switch(among_var){
			case 0:
				return false;
			case 1:
				// (, line 79
				// delete, line 79
				slice_del();
				break;
		}
		return true;
	}
	public boolean stem(){
		// (, line 85
		// backwards, line 86
		limit_backward=cursor;
		cursor=limit;
		// (, line 86
		// do, line 87
		int v_1=limit-cursor;
		lab0:
		do{
			// call remove_category_1, line 87
			if(!r_remove_category_1()){
				break lab0;
			}
		}while(false);
		cursor=limit-v_1;
		// do, line 88
		int v_2=limit-cursor;
		lab1:
		do{
			// (, line 88
			// repeat, line 89
			replab2:
			while(true){
				int v_3=limit-cursor;
				lab3:
				do{
					// (, line 89
					// or, line 89
					lab4:
					do{
						int v_4=limit-cursor;
						lab5:
						do{
							// and, line 89
							int v_5=limit-cursor;
							// call check_category_2, line 89
							if(!r_check_category_2()){
								break lab5;
							}
							cursor=limit-v_5;
							// call remove_category_2, line 89
							if(!r_remove_category_2()){
								break lab5;
							}
							cursor=limit-v_5;
							// call remove_category_3, line 89
							if(!r_remove_category_3()){
								break lab5;
							}
							break lab4;
						}while(false);
						cursor=limit-v_4;
						// call remove_category_3, line 89
						if(!r_remove_category_3()){
							break lab3;
						}
					}while(false);
					continue replab2;
				}while(false);
				cursor=limit-v_3;
				break replab2;
			}
		}while(false);
		cursor=limit-v_2;
		cursor=limit_backward;
		return true;
	}
	public boolean equals(Object o){
		return o instanceof NepaliStemmer;
	}
	public int hashCode(){
		return NepaliStemmer.class.getName().hashCode();
	}
}
