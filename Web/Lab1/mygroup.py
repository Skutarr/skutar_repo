groupmates = [
    {
        "name": "Андрей",
        "surname": "Ким",
        "exams": ["Информатика", "ЭЭиС", "Web"],
        "marks": [4, 3, 5]
    },
    {
        "name": "Иван",
        "surname": "Масленников",
        "exams": ["История", "АиГ", "Информатика "],
        "marks": [4, 4, 4]
    },
    {
        "name": "Сергей",
        "surname": "Казаков",
        "exams": ["Электроооборудование", "Физика", "КТП"],
        "marks": [5, 5, 5]
    },

    {
        "name": "Алексей",
        "surname": "Стукалин",
        "exams": ["Философия", "ИС", "КТП"],
        "marks": [2, 5, 5]
    },

    {
        "name": "Мария",
        "surname": "Иванова",
        "exams": ["Информатика", "КГ", "Физика"],
        "marks": [4, 5, 5]
    },
    {
        "name": "Вероника",
        "surname": " Табакаева",
        "exams": ["Философия", "Экономика", "КТП"],
        "marks": [5, 5, 5]
    }


            ]

def print_students(students):
    print(u"Имя".ljust(15), u"Фамилия".ljust(10), u"Экзамены".ljust(30), u"Оценки".ljust(20))
    for student in students:
        print(student["name"].ljust(15), student["surname"].ljust(10), str(student["exams"]).ljust(30), str(student["marks"]).ljust(20))
print_students(groupmates)

def fun (students,avg_mark):
    stud_list=[]
    for student in students:
        marks= sum(student["marks"]) / len(student["marks"])
        if marks >= avg_mark:
            stud_list.append( student["surname"])


    return print(stud_list)

fun(groupmates,int(input("Enter average mark \n")))