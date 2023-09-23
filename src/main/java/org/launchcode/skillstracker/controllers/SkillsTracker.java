package org.launchcode.skillstracker.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsTracker {

    // Handler that corresponds to localhost:8080

    @GetMapping()
    @ResponseBody
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Trackers</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript<li>" +
                "<li>Python</li>" +
                "<li>Ruby<li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here </a> to select your favorite.</p>" +
                "</body>" +
                "</html>";
    }

    // Handler that corresponds to localhost:8080/form to display form
    @GetMapping("form")
    @ResponseBody
    public String displaySkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'form' method = 'POST'>" +
                "<label>Name:</label>" +
                "<input type ='text' name= 'username' /><br />" +
                "<label>My favorite programming language:</label>" +
                "<select name='fave1'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'TypeScript'> TypeScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "<option value = 'Ruby'> Ruby </option>" +
                "</select>" +
                "<label>My second favorite programming language:</label>" +
                "<select name='fave2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'TypeScript'> TypeScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "<option value = 'Ruby'> Ruby </option>" +
                "</select>" +
                "<label>My third favorite programming language:</label>" +
                "<select name='fave3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'TypeScript'> TypeScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "<option value = 'Ruby'> Ruby </option>" +
                "</select>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit'/>" +
                "</form>" +
                "</body>" +
                "</html";
    }

    // Handler that corresponds to localhost:8080/form to display form AND display results
    @PostMapping("form")
    @ResponseBody
    public String processSkillsForm(@RequestParam String userName, String fave1, String fave2, String fave3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<table>" +
                "<tr>"+
                "<td>1.<td>"+
                "<td>" + fave1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2.<td>" +
                "<td>" + fave1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3.<td>"+
                "<td>" + fave1 + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}