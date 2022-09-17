package com.dress.server.service;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class FashionRecServiceImpl implements FashionRecService {
    static private PythonInterpreter pythonInterpreter;

    FashionRecServiceImpl(){
        pythonInterpreter = new PythonInterpreter();
        //파이썬 파일 경로
        pythonInterpreter.execfile("C:\\Development\\DressRecommend\\dress-recommend-python\\fashion.py");
    }

    @Override
    public List<String> getWomanClothes(int tob, int bottom) {
        PyFunction resultx = pythonInterpreter.get("resultx",PyFunction.class);
        PyObject pyobject = resultx.__call__(new PyInteger(tob),new PyInteger(bottom));
        return (List)pyobject;
    }

    @Override
    public List<String> getManClothes(int tob, int bottom) {
        PyFunction result = pythonInterpreter.get("result",PyFunction.class);
        PyObject pyobject = result.__call__(new PyInteger(tob),new PyInteger(bottom));
        return (List)pyobject;
    }
}
