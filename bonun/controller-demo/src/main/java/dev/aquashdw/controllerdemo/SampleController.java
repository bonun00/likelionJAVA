package dev.aquashdw.controllerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
// 컨트롤러를 어떻게 사용하는지 보여주기위한 클래스
//Ioc컨트롤러를 통해 Bean을 다루게 된다
// 컨트롤러 어노테이션을 붙여줌으로
//컨트롤러 어노테이션을 달아줌으로 클래스객체가
//빈으로써 Ioc컨테이너의 관리를 받게 된다
// {정리}컨트롤러 어노테이션을 달아줌으로 내부에 리퀘스트 매핑을 붙여줄수 있다
// 리퀘스트으 매핑을 이용해 경로에 따라 실행될 함수를 지정
// 리스폰스 바디 가 붙으면 뷰리절버를 거치지않고 데이터를 클라이언트에게 돌려준다
//RestController은 간단하게 Controller의 모든 함수에 + ResponsBody를 붙이는것이다
// 함수를 통해서 어떤 데이터를 받아서 돌려줄지 생각한다면 어떤 경로에 함수를 정의를 할때 사용

// 기본적으로 어떠한 형태의 응답이든 데이터의 일종이다

@Controller
@RequestMapping("view")
public class SampleController {

    private static final Logger logger
            = LoggerFactory.getLogger(SampleController.class);
    @GetMapping("/sample-jsp")
    // 모델을 사용하는 방법에는 여러가지가 있다
    public String sampleJsp(Model model){
        logger.info("in sample jsp");
        List<SamplePayload> profiles = new ArrayList<>();
        profiles.add(new SamplePayload("Adam", 22,"Student"));
        profiles.add(new SamplePayload("Bradley", 29,"Accountant"));
        profiles.add(new SamplePayload("Charlie", 35,"Developer"));
        //변수를 사용할때는 인터페이스를 최대한 이용 구현체를 정의할때는 원하는것

        model.addAttribute("profiles", profiles);

        return "view-jsp";

    }
    @GetMapping("/sample-thyme")
    public ModelAndView sampleThyme(){
        logger.info("in sample thyme");
        ModelAndView modelAndView = new ModelAndView();
        List<SamplePayload> profiles = new ArrayList<>();
        profiles.add(new SamplePayload("Adam", 22,"Student"));
        profiles.add(new SamplePayload("Bradley", 29,"Accountant"));
        profiles.add(new SamplePayload("Charlie", 35,"Developer"));

        modelAndView.addObject("profiles", profiles);
        modelAndView.setViewName("view-thyme");
        return modelAndView;
    }
    //타임리프 사용할때는 templates폴더를 이용 .html문서 작성
}
//    // 빨간줄 떳을때는 Alt +Enter
//    // 하나의 클래스 로거를 만듦
//    private static final Logger logger
//            = LoggerFactory.getLogger(SampleController.class);
//
//    // 경로 설정, 어떠한 경로에 어떠한 함수가 들어갈지 결정할때 등장하는
//    //어노테이션 -> @RequestMapping
//    @GetMapping(
//            value = "/hello"
//            //method = RequestMethod.GET
//            // 브라우저에서 주소를 넣음으로써 새로운 페이지를 가져오는 것은 GET
//    )
//    public String hello(
//            @RequestParam(name= "id", required = false, defaultValue = "")String id
//    ){          //@RequestParam 사용시 URL에서 쿼리의 내용을 가져옴
//                //쿼리는 localhost:8080/hello?!=aquashdw
//        logger.info("path: Hello");
//        logger.info("Query Param Id: " + id);
//        return  "/hello.html";
//    }
//    //리퀘스트 매핑이랑 다른점은 갯 메서드를 고정으로 사용하는것이다
//    @GetMapping(
//            value = "/hello/{id}"
//            //
//    )
//    public String hellopath(@PathVariable("id") String id){
//        logger.info("Path Variable is: "+ id);
//        return "/hello.html";
//    }
//
//    @GetMapping(
//            "/get-profile"
//    )
//    public @ResponseBody SamplePayload getProfile(){
//        return new SamplePayload("aquashdw",10,"Developer");
//        // @ResponseBody 데이터를 자체적으로 사용할수 있게 한다
//    }
//
//}
