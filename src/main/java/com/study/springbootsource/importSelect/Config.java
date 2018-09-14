package com.study.springbootsource.importSelect;

import org.springframework.context.annotation.Import;

@Import(value = {com.study.springbootsource.importSelect.EnableUserService.class})
public class Config {
}
