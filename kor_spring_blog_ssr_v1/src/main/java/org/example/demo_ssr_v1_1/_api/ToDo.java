package org.example.demo_ssr_v1_1._api;

import lombok.Data;

@Data
public class ToDo {

    /** JSON 형식 타입
     * KEY , VALUE 타입
     * */
    // {"userId": 1, "id": 1, "title": "delectus aut autem", "completed": false }

    private Integer userId;
    private Integer id;
    private String title;
    private boolean completed;


    /**
     * String 으로 써도 되지만, 데이터 타입에 맞춰 가공해야되서 그냥 처음부터 맞춰준다.
     */
//    private String userId;
//    private String id;
//    private String title;
//    private String completed;
}
