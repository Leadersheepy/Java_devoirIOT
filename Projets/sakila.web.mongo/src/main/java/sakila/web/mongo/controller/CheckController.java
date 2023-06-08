package sakila.web.mongo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@Slf4j
@AllArgsConstructor
public class CheckController {
    private LocalDateTime getStartTime;
    @GetMapping("/")
    public String check(){
        String msg = String.format("<br><h1 style='text-align:center;color:green'>Server is UP since : %s<h1>", getStartTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd - HH:mm:ss.SSS")));
        msg+=String.format("<h2 style='text-align:center;'><p>\uD83D\uDE0D</p><p>\uD83D\uDE0E</p></h2>");
        msg+=String.format("<br><p style='color:blue;text-align:center;'>%s</p>", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd - HH:mm:ss.SSS")));
        msg+="<p><a href='countries/all'>Countries</a></p>";
        msg+="<p><a href='cities/all'>Cities</a></p>" ;
        msg+="<p><a href='actors/all'>Actors</a></p>" ;
        msg+="<p><a href='films/all'>Films</a></p>" ;
        msg+="</div>" ;
        return msg;
    }
}
