import Component.EmployeeComponent;
import ConcreteComponent.EmployeeConcreteComponent;
import ConcreteDecorator.Manager;
import ConcreteDecorator.TeamLeader;
import ConcreteDecorator.TeamMember;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("Dang Khoa");
        employee.showBasicInformation();
        employee.doTask();
 
        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nTEAM MEMBER: ");
        EmployeeComponent teamMember = new TeamMember(employee);
        teamMember.showBasicInformation();
        teamMember.doTask();
 
        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();
 
        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();

        System.out.println("\nMANAGER AND TEAM MEMBER: ");
        EmployeeComponent teamMemberAndManager = new TeamMember(manager);
        teamMemberAndManager.showBasicInformation();
        teamMemberAndManager.doTask();
    }
}
