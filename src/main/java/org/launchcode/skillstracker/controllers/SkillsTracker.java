package org.launchcode.skillstracker.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsTracker {

    // Handler that corresponds to localhost:8080

    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
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
    @GetMapping("/form")
    public String displaySkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/results' method = 'POST'>" +
                "<label>Name:</label>" +
                "<input type ='text' name= 'username' /><br />" +
                "<label>My favorite programming language:</label>" +
                "<select name='fave1'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'TypeScript'> TypeScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "<option value = 'Ruby'> Ruby </option>" +
                "</select><br/>" +
                "<label>My second favorite programming language:</label>" +
                "<select name='fave2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'TypeScript'> TypeScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "<option value = 'Ruby'> Ruby </option>" +
                "</select><br/>"+
                "<label>My third favorite programming language:</label>" +
                "<select name='fave3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'TypeScript'> TypeScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "<option value = 'Ruby'> Ruby </option>" +
                "</select><br/>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit'/>" +
                "</form>" +
                "</body>" +
                "</html";
    }

    // Handler that corresponds to localhost:8080/form to display form AND display results
    @PostMapping("/results")
    public String processSkillsForm(
            @RequestParam String username, String fave1, String fave2, String fave3){
        return "<html>" +
                "<body>" +
                "<h1>" + username + "</h1>" +
                "<h3>Favorite Languages</h3>"+
                "<table>" +
                "<tr>"+
                "<td>1.<td>"+
                "<td>" + fave1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2.<td>" +
                "<td>" + fave2 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3.<td>"+
                "<td>" + fave3 + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}