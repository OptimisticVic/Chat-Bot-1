package src;

public class getAcademicInfo extends ioHandler {
    public getAcademicInfo() {

        String[] computerResponses = { 
            "What is your academic interest?",
            "Great choice! I also happen to love that subject!",
            "As a freshman, here are the course(s) you can take: ",
            "As a sophomore, here are the course(s) you can take: ",
            "As a junior, here are the course(s) you can take: ",
            "As a senior, here are the course(s) you can take: ",
            "Do you have another academic interest, if so, which one?", 
        };

        String[][] coursesInfoFreshman = { { "Algebra 1, ", "Algebra 1 Honors, ", "Geomerty, ", "Geometry Honors. " },
            { "English 1, ", "Media, ", "Journalism, ", "Yearbook, ", "Graphic Design." },
            { "Living Environment, ", "Chemistry, ", "Biology Research, ", "Physical Science Research. ", "" },
            { "Global History, ", "Political Science, ", "Media and Ethics, ", "Eplorer Program. ", "" },
            { "Chinese I, ", "French I, ", "Spanish I, ", "German I", "" },
            { "Computer Science Essentials", "", " ", "", "" } 
        };

        String[][] coursesInfoSophomore = {
            { "Algebra 1, ", "Algebra 1 Honors, ", "Geomerty, ", "Geometry Honors, ", "Algebra 2, ", "Trignometry, ", "Algebra 2 Honors, ", "Trignometry Honors." },
            { "English 3, ", "Media, ", "Journalism, ", "Yearbook, ", "English 3 Honors.", "History of Media Studies.", "Journalism Production,", "Advanced Media." },
            { "Chemistry, ", "Earth Science, ", "Biology Research, ", "Physical Science Research. ", " ", " ", " ", " " },
            { "Global History, ", "AP Global History, ", "AP European History, ", "Criminology, ", "Homeland Security and Emergency Management, ", "Politics and Public Opinion, ", "Explorer Program. ", " " },
            { "Chinese II, ", "French II, ", "Spanish II, ", "German II. ", " ", "", " ", " " },
            { "AP Computer Science Principals", "", "", "", "", "", "", "" } 
        };

        String[][] coursesInfoJunior = {
            { "Pre-Calculus, ", "Pre-Calculus Honors, ", "AP Statistics, ", "Trigonometry, ", "Trigonometry Honors, ", "Algebra 2, ", "Algebra 2 Honors. ", " ", " " },
            { "English 5, ", "Media, ", "Journalism, ", "Yearbook, ", "English 5 Honors,", "English 5 AP,", "Public Speaking", "Play Production.", " ", " " },
            { "Physics, ", "Earth Science, ", "Astromony, ", "Anatomy and Physiology, ", "Environmental Science,", "AP Biology, ", "AP Chemistry, ", "AP Physics, ", "AP Psycology, ", "AP Environment Science." },
            { "US History/Government, ", "AP American History, ", "Criminology, ", "Criminal Justice, ", "Civil Law, ", "Explorer Program, ", "Sociology. ", " ", " ", "" },
            { "Chinese III, ", "French III, ", "Spanish III, ", "German III, ", "AP Spanish, ", ", ", " ", " ", " ", "" },
            { "AP Computer Science A", "", "", "", "", "", "", "", "", "" } 
        };

        String[][] coursesInfoSenior = {
            { "Pre-Calculus, ", "Pre-Calculus Honors, ", "AP Statistics, ", "Trigonometry, ", "Trigonometry Honors, ", "Calculus Honors, ", "AP Caluculus AB, ", "AP Calculus BC. ", " " },
            { "English 7, ", "Media, ", "Journalism, ", "Yearbook, ", "English 7 Honors,", "Public Speaking,", "Play Production.", " ", " ", " " },
            { "Physics, ", "Earth Science, ", "Astromony, ", "Anatomy and Physicology, ", "Environmental Science,", "AP Biology, ", "AP Chemistry, ", "AP Physics, ", "AP Psycology, ", "AP Environment Science." },
            { "Chinese IV, ", "French IV, ", "Spanish IV, ", "German IV, ", "AP Spanish, ", " ", "Criminology. ", " ", " ", " " },
            { "Cyber Security", "", "", "", "", "", "", "" } 
        };

        String rawInput = scanner.nextLine();
        String input = "";
        int subject = 0;

        for (int i = 0; i < 7; i++) {
            output(computerResponses[i], 0);
            int looped = 0;
            switch (i) {

            case 0:
                rawInput = scanner.nextLine();
                input = rawInput.toLowerCase();
                if (input.indexOf("math") >= 0 || input.indexOf("algebra") >= 0 || input.indexOf("trigonometry") >= 0 || input.indexOf("geometry") >= 0) {
                    subject = 0;
                } else if (input.indexOf("english") >= 0 || input.indexOf("language") >= 0 || input.indexOf("ela") >= 0 || input.indexOf("english language arts") >= 0) {
                    subject = 1;
                } else if (input.indexOf("computer science") >= 0 || input.indexOf("computer") >= 0) {
                    subject = 5;
                } else if (input.indexOf("global") >= 0 || input.indexOf("history") >= 0 || input.indexOf("social studies") >= 0) {
                    subject = 3;
                } else if (input.indexOf("spanish") >= 0 || input.indexOf("foreign language") >= 0) {
                    subject = 4;
                } else if (input.indexOf("science") >= 0 || input.indexOf("chem") >= 0 || input.indexOf("physics") >= 0 || input.indexOf("biology") >= 0) {
                    subject = 2;
                } else if (input.indexOf("none") >= 0 || input.indexOf("no") >= 0 || input.indexOf("nah") >= 0) {
                    i=7;
                }
                break;

            case 2:
                for (int j = 0; j < 4; j++) {
                    output(coursesInfoFreshman[subject][j], 1);
                }
                output("", 0);
                break;

            case 3:
                for (int j = 0; j < 8; j++) {
                    output(coursesInfoSophomore[subject][j], 1);
                }
                output("", 0);
                break;

            case 4:
                for (int j = 0; j < 9; j++) {
                    output(coursesInfoJunior[subject][j], 1);
                }
                output("", 0);
                break;

            case 5:
                for (int j = 0; j < 8; j++) {
                    output(coursesInfoSenior[subject][j], 1);
                }
                output("", 0);
                break;

            case 6:
                input = scanner.nextLine();

                if (input.indexOf("math") >= 0 || input.indexOf("algebra") >= 0 || input.indexOf("trigonometry") >= 0
                        || input.indexOf("geometry") >= 0) {
                    looped++;
                    i = 0;
                    subject = 0;
                } else if (input.indexOf("english") >= 0 || input.indexOf("language") >= 0 || input.indexOf("ela") >= 0
                        || input.indexOf("english language arts") >= 0) {
                    looped++;
                    i = 0;
                    subject = 1;
                } else if (input.indexOf("computer science") >= 0 || input.indexOf("computer") >= 0) {
                    looped++;
                    i = 0;
                    subject = 5;
                } else if (input.indexOf("science") >= 0 || input.indexOf("chem") >= 0 || input.indexOf("physics") >= 0
                        || input.indexOf("biology") >= 0) {
                    looped++;
                    i = 0;
                    subject = 2;
                } else if (input.indexOf("global") >= 0 || input.indexOf("history") >= 0
                        || input.indexOf("social studies") >= 0) {
                    looped++;
                    i = 0;
                    subject = 3;
                } else if (input.indexOf("foreign language") >= 0 || input.indexOf("spanish") >= 0
                        || input.indexOf("french") >= 0) {
                    looped++;
                    i = 0;
                    subject = 4;
                }  else if (input.indexOf("none") >= 0 || input.indexOf("no") >= 0 || input.indexOf("nah") >= 0) {
                    i=7;
                }
                break;
            }

            if (i < 6 && i != 0 && looped == 0) {
                input = scanner.nextLine();
            }

            if (input.indexOf("repeat") >= 0) {
                output("Sure thing!", 0);
                i--;
            }

            if (input.indexOf("freshmen") >= 0 || input.indexOf("freshman") >= 0) {
                output("No problem!", 0);
                i = 1;
            } else if (input.indexOf("sophomores") >= 0) {
                output("No problem!", 0);
                i = 2;
            } else if (input.indexOf("juniors") >= 0) {
                output("No problem!", 0);
                i = 3;
            } else if (input.indexOf("seniors") >= 0) {
                output("No problem!", 0);
                i = 4;
            }

            if (i > 2) {
                if (input.indexOf("math") >= 0 || input.indexOf("algebra") >= 0 || input.indexOf("trigonometry") >= 0
                        || input.indexOf("geometry") >= 0) {
                    subject = 0;
                } else if (input.indexOf("english") >= 0 || input.indexOf("language") >= 0 || input.indexOf("ela") >= 0
                        || input.indexOf("english language arts") >= 0) {
                    subject = 1;
                } else if (input.indexOf("science") >= 0 || input.indexOf("chem") >= 0 || input.indexOf("physics") >= 0
                        || input.indexOf("biology") >= 0) {
                    subject = 2;
                } else if (input.indexOf("global") >= 0 || input.indexOf("history") >= 0
                        || input.indexOf("social studies") >= 0) {
                    subject = 3;
                } else if (input.indexOf("foreign language") >= 0 || input.indexOf("spanish") >= 0
                        || input.indexOf("french") >= 0) {
                    subject = 4;
                }
            }
        }
    }
}