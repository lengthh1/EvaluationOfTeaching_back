package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.controller.Questionnaire;

import java.util.List;
import java.util.Map;

public interface ToEService {
    List<Questionnaire> queryFinishedQuestionnaire(String code,boolean isStudent);


    Map<String, String> queryFinishedDetailById(int id);
}
