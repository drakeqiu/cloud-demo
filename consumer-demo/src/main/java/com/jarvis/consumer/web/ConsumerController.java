package com.jarvis.consumer.web;

import com.jarvis.consumer.client.UserClient;
import com.jarvis.consumer.domain.User;
//import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 4:30 PM 2020/4/4
 * @Modified By:
 */
@Slf4j
//@DefaultProperties(defaultFallback = "defaultFallback")
@RestController
@RequestMapping("consumer")
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @Autowired
//    private RibbonLoadBalancerClient client;

    /*@GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);
        ServiceInstance instance = client.choose("user-service");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }*/

//    @HystrixCommand(fallbackMethod = "queryByIdFallback")
//    @GetMapping("/{id}")
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })

//    @HystrixCommand
//    public String queryById(@PathVariable("id") Long id) {
//        String url = "http://user-service/user" + id;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;
//    }

    public String queryByIdFallback(Long id) {
        log.error("fail to query user info by id {}", id
        );
        return "System is busy!";
    }

    public String defaultFallback() {
        return "System is busy!";
    }

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        log.info("query user by id {}.", id);
        return userClient.queryById(id);
    }
}
