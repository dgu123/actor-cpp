package domaine



object ProcessStatus
{
  val Image      ="Nom de l'image"
  val PID 		 ="PID"
  val Vm_Data 	 ="VmData"
  val Vm_Stk	 ="VmStk"
  val Vm_Swap    ="VmSwap" 
  val Vm_Peak    ="VmPeak"
  val Vm_Exe     ="VmExe"
  val Vm_Rss     ="VmRss"
  val Cpu_Time   ="Cpu time"
  val Cpu_Taux   ="Cpu usage"  
  val User       ="User"
  val Threads    ="Threads"
  val ColumnCount =12
}

/**
 * Classe representant le status d'un processus Linux
 */
class ProcessStatus (val pid:Int) {

  
  
  /**
   * Le pid du processus
   */
  var Pid = pid
  
  /**
   * La taille de la stack du processus
   */
  var VmStk:Int=0
  
  /**
   * La taille du segment de donn�es du processus
   */
  var VmData:Int=0
  
  /**
   * La commande ex�cute par le processus en question
   */
  var Commande :String=null
  
  /**
   * Le peak de m�moire virtuelle du processus
   */
  var VmPeak : Int = 0
  
  /**
   * M�moire virtuelle v�rouill�e en RAM
   */
  var VmLock: Int =0

  /**
   * M�moire virtuelle occup�e par les libs
   */
  var VmLib : Int =0
  
  
  /**
   * M�moire virtuelle actuellement dans le swap
   */
  var VmSwap:Int = 0
  
  /**
   * Nombre de threads dans le processus
   */
  var Threads: Int = 0
  
  
  /**
   * La taille d'une PTE
   */
  var VmPTE: Int = 0
  
  /**
   * La taille de ma m�moire r�sidant en RAM
   */
  var VmRSS :Int = 0
  
  /**
   * La taille de l'executable en RAM
   */
  var VmExe: Int = 0
  
  /**
   * Peak de m�moire physique
   */
  var VmHWM: Int = 0
  
  /**
   * Affiche une description textuelle du processus
   */
  override def toString()={
   "pid:%d|vmPeak:%d|vmLock:%d|vmHwm:%d|vmRss:%d|vmData:%d|vmStack:%d|vmExe:%d|vmLib:%d|vmSwap:%d|vmPTE:%d|threads:%d|VmPSS:%d|VmUSS:%d".
   format(	Pid,
		   	VmPeak,
		   	VmLock,
		   	VmHWM,
		   	VmRSS,
		   	VmData,
		    VmStk,
		    VmExe,
		    VmLib,
		    VmSwap,
		    VmPTE,
		    Threads,
		    getPSS(),
		    getUSS()
		   )
  }
		 
  	/**
  	 * Get the proportionnel page set size of the this process
  	 */
	def getPSS()={
     0
	}
	
	/**
	 * Get the unique set size of this process
	 */
	def getUSS()={
	  0
	}
}