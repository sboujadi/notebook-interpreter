package com.notebook.interpreter.service.impl;

import com.notebook.interpreter.service.GraalVmInterpreterService;
import org.springframework.stereotype.Service;

@Service
public class PythonInterpreterServiceImpl extends GraalVmInterpreterService {

    private static final String INTERPRETER_LANGUAGE = "python";

    @Override
    public String getInterpreterLanguage() {
        return INTERPRETER_LANGUAGE;
    }

}
