package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor//无参构造的注解
@AllArgsConstructor//有参构造的注解
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
