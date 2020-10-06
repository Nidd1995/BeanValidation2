package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Employee {

@Min(1)
@Max(10)
private String empId;

}
