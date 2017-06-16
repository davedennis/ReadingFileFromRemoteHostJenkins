def file = readFileFromWorkspace('weblogic-apps-auto.csv')
def jobList = new ArrayList();
file.splitEachLine(",")
{
    fields ->
        println "Evaluting .csv values: " + fields[0] + ", " + fields[1] + ", " + fields[2] +", " + fields[3];

    if(!fields[0].startsWith("#"))
    {
        jobList.add(new AppConfig(fields[0], fields[1],fields[2],fields[3]));
    }
}