package com.dharma.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan( basePackages =["com.dharma.user","com.dhamma.pesistence"])
@ComponentScan({"com.dharma.user", "com.dhamma.pesistence"})
public class AngularsubmitApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularsubmitApplication.class, args);
    }

}


//@RestController
//@CrossOrigin
//class A {
//
//
//    @CrossOrigin
//    @PutMapping("/investigate")
//
////    public ResponseEntity<Investigate> updateInvestigate(@RequestBody Investigate invs) {
//    public ResponseEntity<JsonNode> updateInvestigate(@RequestBody JsonNode node) {
//        System.out.println("-----------------------createStock-----------------" + node);
////        System.out.println("-----------------------createStock-------A----------" + invs.crap);
////        System.out.println("-----------------------createStock-------B----------" + invs.why);
//
//
//        return new ResponseEntity<JsonNode>(node, HttpStatus.OK);
//
//
//    }
//
//
//    @CrossOrigin
//    @PutMapping("/investigatem")
//
//    public ResponseEntity<JsonNode> updateInvestigatem(@RequestBody JsonNode node) {
//        System.out.println("-----------------------createStock-----------------" + node);
////        System.out.println("-----------------------createStock-------A----------" + invs.crap);
////        System.out.println("-----------------------createStock-------B----------" + invs.why);
//
//
//        return new ResponseEntity<JsonNode>(node, HttpStatus.OK);
//
//
//    }
//
//
//    @CrossOrigin
//    @GetMapping("/items")
//    public ArrayNode items() {
//        System.out.println("-----------ITEMS---------");
//
////        JsonArray mainArray = new JsonArray();
////
////        JsonObject content = new JsonObject();
////        content.addProperty("id", "ma");
////        content.addProperty("value", "0.2<50");
////        mainArray.add(content);
////
////        content = new JsonObject();
////        content.addProperty("id", "ma");
////        content.addProperty("value", "0.5<200");
////        mainArray.add(content);
////
////        content = new JsonObject();
////        content.addProperty("id", "rsi");
////        content.addProperty("value", "30<14");
////        mainArray.add(content);
////        //  mainArray.
////
////        List<JsonElement> list = new ArrayList();
//////        for (int i = 0; i < array.length();list.add(array.getJSONObject(i++)));
//////        System.out.println("--------------------" + mainArray.getAsJsonObject());
//////        System.out.println("--------------------" + mainArray.getAsJsonObject().getClass().getSimpleName());
////        mainArray.forEach(a -> {
////            list.add(a);
////        });
////
////        return list;
//
//
//        ObjectMapper mapper = new ObjectMapper();
//        ArrayNode arrayNode = mapper.createArrayNode();
//
//        ObjectNode objectNode1 = mapper.createObjectNode();
//        objectNode1.put("id", "ma");
//        objectNode1.put("value", "0.2<50");
//        arrayNode.add(objectNode1);
//
//        objectNode1 = mapper.createObjectNode();
//        objectNode1.put("id", "ma");
//        objectNode1.put("value", "0.5<200");
//        arrayNode.add(objectNode1);
//
//        objectNode1 = mapper.createObjectNode();
//        objectNode1.put("id", "rsi");
//        objectNode1.put("value", "30<14");
//        arrayNode.add(objectNode1);
//        return arrayNode;
//
//    }
//
//    @CrossOrigin
//    @GetMapping(value = "/rsi/{algo}")
//    public String getbydate(@PathVariable String algo) {
//        //String val= algo.
//
//        return "xx";
//
//
//    }
//
//
//}
//
//
//@Data
//class Investigate {
//
//    String crap;
//    String why;
//
//
//}