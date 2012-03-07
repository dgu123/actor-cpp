package domaine

trait RequestManager {

  /**
   * Permet de recupere la liste des processus en cours d'ex�cution 
   * dans les syst�me
   */
  def getProcessList():List[domaine.ProcessStatus]
  
  /**
   * Renvoie le status du processus de pid pass� en argument
   */
  def getProcessById(pid:Int):domaine.ProcessStatus
  
}