//
//  ViewController.swift
//  AddFlutterToApp
//
//  Created by Julio Olivares on 04-06-22.
//

import UIKit
import Flutter

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
    }

    @IBAction func openFlutter(_ sender: Any) {
        let flutterEngine = (UIApplication.shared.delegate as! AppDelegate).flutterEngine
        let flutterVC = FlutterViewController(engine: flutterEngine, nibName: nil, bundle: nil)
        present(flutterVC, animated: true, completion: nil)
    }
}

