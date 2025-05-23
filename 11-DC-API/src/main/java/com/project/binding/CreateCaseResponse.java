package com.project.binding;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CreateCaseResponse {

    private Long caseNum;

    private Map<Integer,String> planNames;
}
