package com.cts.soportal;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SOController {

                @Autowired
                SOService soService;

                @PostMapping("/save")
                public void saveForm(@RequestBody SODetail soDetail) throws ParseException {
                                soService.save(soDetail);
                }

                @GetMapping("/fetch/{loginId}")
                public MstrUser fetch(@PathVariable String loginId) {

                                return soService.findByLoginId(loginId);

                }
                
                

                // http://localhost:8080/fetchStatusType?statusType1=SOType&statusType2=SOStatus
                @GetMapping("/fetchStatusType")
                public List<MstrStatus> fetchStatusType(@RequestParam String statusType1, @RequestParam String statusType2) {
                                return soService.findByStatusType(statusType1, statusType2);
                }

                // http://localhost:8080/fetchLocation
                @GetMapping("/fetchLocation")
                public List<MstrResourceLocation> fetchLocation() {
                                return soService.findByLocation();
                }

                @GetMapping("/fetchLob")
                public List<MstrLob> fetchLob() {
                                return soService.findByLob();
                }

                @GetMapping("/fetchSOId")
                public List<SODetail> fetchSOId() {
                                return soService.findBySOId();
                }

                @GetMapping("/fetchProject")
                public List<MstrWorkOrder> fetchProject() {
                                return soService.findByProject();
                }

                @GetMapping("/fetchSkill")
                public List<MstrSkill> fetchSkill() {
                                return soService.findBySkill();
                }

                @GetMapping("/fetchPractise")
                public List<SOPractiseArea> fetchPractice() {
                                return soService.findByPractice();
                }
   // http://localhost:8080/fetchdl
                @GetMapping("/fetchdl")
                public List<SOPractise> fetchdl() {
                                return soService.findBydl();
                }
                @GetMapping("/fetchdata")
                public List<SODetail> fetchData() {
                                return soService.fetchData();
                }

}
